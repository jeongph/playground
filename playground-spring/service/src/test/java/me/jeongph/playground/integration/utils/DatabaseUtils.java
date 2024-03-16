package me.jeongph.playground.integration.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

@Component
public class DatabaseUtils {

    @PersistenceContext
    private EntityManager em;

}
