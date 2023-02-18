package ${config.outputPackages.services}.impl;

import ${entityPackage}.${entityClass};
import ${config.outputPackages.repositories}.${entityClass}Repository;
import ${config.outputPackages.services}.${entityClass}Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;

/**
* Generated by Springboot-3layer-Generator at ${dateGen?datetime}
*/
@Service
public class ${entityClass}ServiceBean implements ${entityClass}Service {

    @Autowired
    private ${entityClass}Repository repository;

    @Override
    public ${entityClass} create(${entityClass} entity) {
        return repository.save(entity);
    }

    @Override
    public ${entityClass} update(${entityClass} entity) {
        return repository.save(entity);
    }

    @Override
    public Page<${entityClass}> read(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Optional<${entityClass}> readOne(${primaryKeyClass} primaryKey) {
        return repository.getOne(primaryKey);
    }

    @Override
    public void delete(${primaryKeyClass} primaryKey) {
        repository.deleteById(primaryKey);
    }
}
