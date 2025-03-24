//package br.com.dio.barbershopui.old.controller;
//
//
//import br.com.dio.barbershopui.old.entity.ClientEntity;
//import br.com.dio.barbershopui.old.repository.IClientRepository;
//import jakarta.validation.Valid;
//import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//
//
//@RestController
//@RequestMapping("clients")
//@AllArgsConstructor
//public class ClientController {
//
//    @Autowired
//    IClientRepository clientRepository;
//
//    @PostMapping
//    public void save(@RequestBody @Valid ClientEntity client){
//        clientRepository.save(client);
//    }
//
//    @PutMapping("{id}")
//    public void update(@PathVariable final long id, @RequestBody @Valid ClientEntity client){
//        clientRepository.save(client);
//    }
//
//    @DeleteMapping("{id}")
//    public void delete(@PathVariable final long id){
//        clientRepository.deleteById(id);
//    }
//
//    @GetMapping("{id}")
//    Optional<ClientEntity> findById(@PathVariable final long id){
//        Optional<ClientEntity> byId = clientRepository.findById(id);
//        return byId;
//    }
//
//    @GetMapping
//    List<ClientEntity> list(){
//        List<ClientEntity> all = clientRepository.findAll();
//        return all;
//    }
//
//}
