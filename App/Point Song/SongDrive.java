package com.wq;
/**
 * 
 * @author wq
 * @date October 1,2018
 */
public class SongDrive {
	public Master master;//主持人
	public Player player;//点歌的
	public SongDrive()//初始化master和player
	{
		master=new Master();
		player=new Player();
	}
	public static void main(String[] args)//入口函数
	{
		SongDrive a=new SongDrive();
		a.player.addSong();
		a.player.addSong();
		a.master.play();
	}
}
