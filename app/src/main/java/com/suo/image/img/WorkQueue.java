package com.suo.image.img;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class WorkQueue {
	BlockingDeque<Runnable> mdeq = new LinkedBlockingDeque<Runnable>();
	ThreadPoolExecutor mThreadPool;
	public WorkQueue(int nThread) {
		this.mThreadPool = new ThreadPoolExecutor(
				nThread, nThread, 10, TimeUnit.SECONDS, mdeq,
				new ThreadPoolExecutor.DiscardOldestPolicy());
		this.mThreadPool.prestartAllCoreThreads();
	}
	public void push(Runnable cmd){
		mdeq.push(cmd);
	}
}
