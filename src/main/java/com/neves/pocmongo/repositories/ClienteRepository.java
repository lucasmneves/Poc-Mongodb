package com.neves.pocmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.neves.pocmongo.documents.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
