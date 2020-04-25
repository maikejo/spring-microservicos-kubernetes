package br.com.revebiveis;

import org.springframework.stereotype.Service;

@Service
public class RecebiveisService {

    public RecebiveisService() {
        System.out.println("Construtor Recebiveis");
    }

    public String hello() {
        return "Micro Serviços - Recebiveis";
    }
}
