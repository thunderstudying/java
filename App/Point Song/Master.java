package com.wq;
import java.util.List;
import java.util.ArrayList;
/**
 * 
 * @author wq
 * @date October 1,2018
 */
public class Master {
	static List<Song> listSong;//歌曲列表，所有歌曲共享一个列表
	public Master()//构造函数，初始化list
	{
		listSong=new ArrayList<Song>();
	}
	public boolean play()//播放歌曲
	{
		System.out.println(listSong.get(0).toString());//打印即将播放的歌曲信息
		return true;
	}
}
