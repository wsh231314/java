package java_training.co.jp.io;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class WatchTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WatchService watch = FileSystems.getDefault().newWatchService();
		
		Path dir = FileSystems.getDefault().getPath("C:\\\\Users\\\\shawn.shaohua.wang\\\\test");
		
		WatchKey key = dir.register(watch, StandardWatchEventKinds.ENTRY_CREATE
				, StandardWatchEventKinds.ENTRY_MODIFY
				, StandardWatchEventKinds.ENTRY_DELETE);
		
		
		while (true) {
			key = watch.take();
			for (WatchEvent<?> event : key.pollEvents()) {
				Object ob = event.context();
				if (ob instanceof Path) {
					System.out.println(ob);
				}
				
			}
			key.reset();
		}
	}

}
