package com.mleitejunior.cronspring;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@EnableScheduling
public class VerificadorDePagamentos {

    private static final String TIME_ZONE = "America/Sao_Paulo";

    /* Campos Cron Expression
    * A B C D E F
        A: Segundos (0 - 59).
        B: Minutos (0 - 59).
        C: Horas (0 - 23).
        D: Dia (1 - 31).
        E: Mês (1 - 12).
        F: Dia da semana (0 - 6).
    * */


    // Teste a cada 5 segundos
    @Scheduled(cron = "*/5 * * * * *", zone = TIME_ZONE) public void verificaPorHora() {
        System.out.println(LocalDateTime.now().getSecond());
    }
}
