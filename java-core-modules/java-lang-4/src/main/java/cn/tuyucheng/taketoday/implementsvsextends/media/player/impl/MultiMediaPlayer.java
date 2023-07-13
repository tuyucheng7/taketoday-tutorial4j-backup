package cn.tuyucheng.taketoday.implementsvsextends.media.player.impl;

import cn.tuyucheng.taketoday.implementsvsextends.media.player.AdvancedPlayerOptions;
import cn.tuyucheng.taketoday.implementsvsextends.media.player.MediaPlayer;

public class MultiMediaPlayer implements MediaPlayer, AdvancedPlayerOptions {

	@Override
	public void play() {
		System.out.println("MultiMediaPlayer is Playing");
	}

	@Override
	public void pause() {
		System.out.println("MultiMediaPlayer is Paused");
	}

	@Override
	public void seek() {
		System.out.println("MultiMediaPlayer is being seeked");
	}

	@Override
	public void fastForward() {
		System.out.println("MultiMediaPlayer is being fast forwarded");
	}
}