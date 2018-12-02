package multi;

import java.util.concurrent.CountDownLatch;
/**
 * 
 * @author wq
 * @date Nov 22,2018
 */
public class MyMatrix implements Runnable {
	static int[][] a; //= { { 1, 3 }, { 5, 2 }, { 3, 1 } }, b = { { 5, 3, 1 }, { 6, 2, 2 } };// 创建的俩个矩阵，矩阵中的元素可任意
	static int[][] b;
	static int[][] c; //= new int[a.length][b[0].length];// 接收上面两个矩阵的积的矩阵
	int index;// 矩阵的行下标
	static Thread t[]; //= new Thread[a.length];// 按a矩阵的行数创建线程数组 
	static CountDownLatch countDown;//=new CountDownLatch(a.length);//子线程数，用于判断多线程是否执行完成
	static int threadNumber;//线程数
	static int perThread;//每个线程进行多行的运算
	MyMatrix() {

	}
	
	MyMatrix(int index) {
		this.index = index;// 当前线程矩阵的行下标
	}
	
	public void run() {
		
			/*if (a[0].length == b.length) {// a矩阵的列数等于b矩阵的行数才能进行矩阵的乘法
				this.matrix(index, a, b);
			} */
			if(a[0].length == b.length) {//threadnumber 4 perthread 25
				for(int i=0;i<perThread;i++,index+=threadNumber)
					this.matrix(index, a, b);
			
			}
			else {
				System.out.println("当前两个矩阵不能进行乘法运算");
			}
			countDown.countDown();
	}

	public void matrix(int index, int[][] a, int[][] b) {// 取得传入的行下标所在行的矩阵的积

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[index][i] += a[index][j] * b[j][i];
			}
			// 此语句是为了打印每个线程的执行过程，想看的可以把注释符去掉
			//System.out.println(Thread.currentThread().getName() + " c[" + index + "][" + i + "]:" + c[index][i]);
		}
	}
	public static void initMatrix(int rr,int cc)//生成n阶随机矩阵
	{
		a=create_Matrix(rr,cc);
		b=create_Matrix(cc,rr);
		c=new int[a.length][b[0].length];
		threadNumber=5;//想要多少线程计算就改为几
		perThread=a.length/threadNumber;//
		//t=new Thread[a.length];
		t=new Thread[threadNumber];
		//countDown=new CountDownLatch(a.length);
		countDown=new CountDownLatch(threadNumber);
	}
	public static int[][] create_Matrix(int row_number,int column_number ) {
		 
		 
		int matrixA[][] = new int[row_number][column_number];
		for (int i = 0; i < row_number; i++) {
			for (int j = 0; j < column_number; j++) {
				matrixA[i][j] = random_number();
				//System.out.print(matrixA[i][j] + " ");
			}
			//System.out.println();
		}
		return matrixA;
	}
 
 
//产生一个1~100的随机整数，用于自动填入矩阵A的每个位之中 
    public static int random_number(){
    	int number;
    	number = new java.util.Random().nextInt(100)+1;
    	return number;
    }

	public void print(int[][] a) {// 打印传入的矩阵
		System.out.println("***矩阵***");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) throws InterruptedException {
		MyMatrix d = new MyMatrix();// 创建当前类的对象，方便调用方法
		// 输出三个矩阵有多少行和多少列
		//System.out.println("a是" + a.length + "行" + a[0].length + "列");
		//System.out.println("b是" + b.length + "行" + b[0].length + "列");
		//System.out.println("c是" + c.length + "行" + c[0].length + "列");
		MyMatrix.initMatrix(10000,10000);//设置矩阵相乘的规模
		long beforeTime=System.currentTimeMillis();
		//for (int i = 0; i < a.length; i++) {// 创建多线程
		for (int i = 0; i < threadNumber; i++) {
			t[i] = new Thread(new MyMatrix(i));// 创建线程
			t[i].setName("线程" + i);// 设置线程的名字
			t[i].start();// 当前线程开始执行
		
		}
		countDown.await();//同步等待，所有子线程结束后执行之后的代码
		long afterTime=System.currentTimeMillis();
		System.out.println(MyMatrix.threadNumber+"个线程运算矩阵相乘用时"+(afterTime-beforeTime)+"毫秒");
		//d.print(a);// 打印矩阵a
		//d.print(b);// 打印矩阵b
		//d.print(c);// 打印矩阵c

	}
}
