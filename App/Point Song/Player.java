package com.wq;
import java.util.Scanner;
/**
 * 
 * @author wq
 * @date October 1,2018
 */
public class Player {
	public boolean addSong()//点歌
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入歌名");		
		String songName=sc.next();
		System.out.println("请输入演唱者");
		String singer=sc.next();
		System.out.println("请输入歌曲时长");
		double time=sc.nextDouble();
		Song song=new Song(songName,singer,time);
		Master.listSong.add(song);
		return true;
	}
}
