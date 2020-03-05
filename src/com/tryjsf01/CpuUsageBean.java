package com.tryjsf01;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@ManagedBean
@ViewScoped
public class CpuUsageBean {
	private AtomicInteger cpuUsage;

	@PostConstruct
	public void init() {
		cpuUsage = new AtomicInteger(50);
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(() -> {
			while (true) {
				// simulating cpu usage
				int i = ThreadLocalRandom.current().nextInt(-10, 11);
				int usage = cpuUsage.get();
				usage += i;
				if (usage < 0) {
					usage = 0;
				} else if (usage > 100) {
					usage = 100;
				}
				cpuUsage.set(usage);
				try {
					TimeUnit.MILLISECONDS.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});
	}

	public int getCpuUsage() {
		return cpuUsage.get();
	}
}
