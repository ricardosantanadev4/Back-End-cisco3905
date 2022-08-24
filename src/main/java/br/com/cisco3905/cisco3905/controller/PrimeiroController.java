package br.com.cisco3905.cisco3905.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cisco3905.cisco3905.model.Ramal;

// indica que essa classe vai ser um controlador, e permite usar todas as funcionalidades da arquitetura rest
// melhor que o @Controle que nao usa as funcionalidades da arquitetura rest
@RestController
// cria um ideficandor para esse controlador para que ele possa ser encontrado
// "/ramal" vai ser o end point o endereco de acesso aos servicos
@RequestMapping("/ramal")

public class PrimeiroController {

	@GetMapping("/listar")
	public List<Ramal> listar(){
		Ramal ramaL1 = new Ramal(1L, "6501", "WZK60634", "192.168.0.1");
		Ramal ramal2 = new Ramal(2L, "6502", "WZK60635", "192.168.0.2");
		Ramal ramal3 = new Ramal(3L, "6503", "WZK60636", "192.168.0.3");
		List<Ramal> listarRamal = Arrays.asList(ramaL1,ramal2,ramal3);
		return listarRamal;
	}
}
