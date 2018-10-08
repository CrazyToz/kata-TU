package fr.kata.unit.test.examples.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DummyDao {

    @Autowired
    private TroublesomeDependency troublesomeDependency;

    public void doStuff() {
        DummyEntity dummyEntity = troublesomeDependency.doInsaneStuffInDatasbase();
        // do stuff
    }

}
