package ${config.outputPackages.controllers};

import ${entityPackage}.${entityClass};
import ${config.outputPackages.services}.${entityClass}Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
* Generated by Springboot-3layer-Generator at ${dateGen?datetime}
*/
@RestController
@RequestMapping("/${entityClass?lower_case}/")
public class ${entityClass}Controller implements CrudController<${entityClass},${primaryKeyClass}>{

    @Autowired
    private ${entityClass}Service service;

    @Override
    public ResponseEntity<${entityClass}> create(@RequestBody ${entityClass} entity) {
        return ResponseEntity.ok(service.create(entity));
    }

    @Override
    public ResponseEntity<${entityClass}> update(@RequestBody ${entityClass} entity) {
        return ResponseEntity.ok(service.update(entity));
    }

    @Override
    public ResponseEntity<Page<${entityClass}>> read(
            @RequestBody ${entityClass} entity,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size) {
        Pageable pageable = PageRequest.of(page,size);
        return ResponseEntity.ok(service.read(entity,pageable));
    }

    @Override
    public ResponseEntity<${entityClass}> readOne(@PathVariable("id") ${primaryKeyClass} primaryKey) {
        return ResponseEntity.ok(service.readOne(primaryKey));
    }

    @Override
    public void delete(${primaryKeyClass} primaryKey) {
        service.delete(primaryKey);
    }
}