package fr.kata.unit.test.examples.spring;

import org.springframework.stereotype.Repository;

@Repository
public class TroublesomeDependency {

    public DummyEntity doInsaneStuffInDatasbase() {
        return new DummyEntity("Dummy Entity");
    }

}
