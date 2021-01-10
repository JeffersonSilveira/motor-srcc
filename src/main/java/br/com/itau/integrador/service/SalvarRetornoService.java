package br.com.itau.integrador.service;

import org.springframework.stereotype.Service;

import br.com.itau.integrador.entity.Endereco;
import br.com.itau.integrador.repositories.SalvarEnderecoRepository;

@Service
public class SalvarRetornoService {

	private SalvarEnderecoRepository salvarEnderecoRepository;

	public void salvandoRetorno(Endereco endereco) {
		
	Endereco retorno = salvarEnderecoRepository.save(endereco);

	}

}
