package au.com.servicevic.game;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameApplication implements CommandLineRunner {
	private static final int DEFAULT_N = 10;
	private static final int DEFAULT_K = 3;

	public static void main(String[] args) {
		SpringApplication.run(GameApplication.class, args);
	}

	@Override
	public void run(String... args) {
		int n;
		int k;
		if (args.length > 1) {
			n = Integer.valueOf(args[0]);
			k = Integer.valueOf(args[1]);
		} else {
			n = DEFAULT_N;
			k = DEFAULT_K;
		}
		System.out.format("Children circle game with n = %d, k = %d \n", n, k);
		System.out.println(GameExecution.play(n, k));
	}

}
