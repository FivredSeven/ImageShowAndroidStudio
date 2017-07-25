package com.suo.image.img;



public class WorkQueueManager {
	private final int MAX_QUEUE_THREAD_IMG = 5;
	private final int MAX_QUEUE_THREAD_NEWS = 5;
	private static WorkQueueManager _instance = new WorkQueueManager();
	private static WorkQueue m_imgDownloadTaskQueue;
	private static WorkQueue m_newsDownloadTaskQueue;
	public static synchronized WorkQueueManager getInstance(){
		return _instance;
	}
	
	public synchronized WorkQueue getImageDownloadTaskQueue() {
		if(m_imgDownloadTaskQueue == null){
			m_imgDownloadTaskQueue = new WorkQueue(MAX_QUEUE_THREAD_IMG);
		}
		return m_imgDownloadTaskQueue;
	}
	
	public synchronized WorkQueue getNewsDownloadTaskQueue() {
		if(m_newsDownloadTaskQueue == null){
			m_newsDownloadTaskQueue = new WorkQueue(MAX_QUEUE_THREAD_NEWS);
		}
		return m_newsDownloadTaskQueue;
	}

	private WorkQueueManager() {
	}
}
