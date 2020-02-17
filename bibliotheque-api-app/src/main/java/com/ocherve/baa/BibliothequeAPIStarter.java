package com.ocherve.baa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Api starter
 * 
 * @author herve_dev
 *
 */
@SpringBootApplication(scanBasePackages = {
									"com.ocherve.baa",
									"com.ocherve.bas",
									"com.ocherve.bap",
									"com.ocherve.bam",
									"com.ocherve.bau"})
@EntityScan("com.ocherve.bam")
@EnableJpaRepositories("com.ocherve.bap")
public class BibliothequeAPIStarter {


    /**
     * Main method
     * 
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(BibliothequeAPIStarter.class, args);
    }
}
