package br.com.murilo.aluguel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.murilo.aluguel.data.vo.ProprietarioVO;
import br.com.murilo.aluguel.service.ProprietarioService;

@RestController
@RequestMapping("/api/v1/proprietario")
public class ProprietarioController {

	@Autowired
	private ProprietarioService service;

	@GetMapping
	public ResponseEntity<List<ProprietarioVO>> findAll() {
		List<ProprietarioVO> proprietarios = service.findAll();
		return (proprietarios.isEmpty() ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
				: new ResponseEntity<>(proprietarios, HttpStatus.OK));
	}
	
	@GetMapping(value = "/{id}")
	public ProprietarioVO findById(@PathVariable("id")Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<ProprietarioVO> create(@RequestBody ProprietarioVO proprietario) {
		return new ResponseEntity<>(service.create(proprietario), HttpStatus.CREATED);
	}
}
