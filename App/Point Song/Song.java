package com.wq;
/**
 * 
 * @author wq
 * @date October 1,2018
 */
public class Song {
	String songName;//歌曲名	
	String singer;//歌手
	double time;//歌曲时长
	public Song(String songName,String singer,double time)//构造函数
	{
		this.songName=songName;
		this.singer=singer;
		this.time=time;
	}
	public String toString()//重写Song类对象的toString()函数，以便在listSong中打印歌曲信息
	{
		StringBuffer s = new StringBuffer(""); 
		s.append("歌曲名"+ this.songName+"\n"); 
		s.append("歌手"+ this.singer+"\n"); 
		s.append("歌曲时长"+ this.time+"\n"); 
		return s.toString();//返回重写后的字符串
	}	
}
