package com.example.adminserver.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.adminserver.entity.Usuarios;
import com.example.adminserver.repository.RepoUsuarios;


@RestController
@RequestMapping(value = "api")
public class ControllerUsuarios {

    @Autowired
    RepoUsuarios repositoriousuarios;


    @PostMapping("/registro")
    public ResponseEntity<Usuarios> save(@RequestBody Usuarios customer) {
        try {
            return new ResponseEntity<>(repositoriousuarios.save(customer), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Usuarios>> getAllCustomers() {
        try {
            List<Usuarios> list = repositoriousuarios.findAll();
            if (list.isEmpty() || list.size() == 0) {
                return new ResponseEntity<List<Usuarios>>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<List<Usuarios>>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/listar/usuario/{id}")
    public ResponseEntity<Usuarios> getSingleCustomer(@PathVariable Long id) {
        Optional<Usuarios> customer = repositoriousuarios.findById(id);

        if (customer.isPresent()) {
            return new ResponseEntity<Usuarios>(customer.get(), HttpStatus.OK);
        }

        return new ResponseEntity<Usuarios>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("eliminar/usuario/{id}")
    public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable Long id) {
        try {
            Optional<Usuarios> customer = repositoriousuarios.findById(id);
            if (customer.isPresent()) {
                repositoriousuarios.delete(customer.get());
            }
            return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}
