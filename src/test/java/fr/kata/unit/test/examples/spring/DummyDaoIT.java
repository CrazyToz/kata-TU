package fr.kata.unit.test.examples.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MockContextConfiguration.class})
public class DummyDaoIT {

    @Autowired
    private DummyDao dummyDao;

    @Autowired
    private TroublesomeDependency troublesomeDependency;

    @Test
    public void test_dao_without_call_troublesome_dependency() {
        // GIVEN
        DummyEntity dummyEntity = new DummyEntity("Mocked dummy entity");
        Mockito.when(troublesomeDependency.doInsaneStuffInDatasbase()).thenReturn(dummyEntity);

        // WHEN
        dummyDao.doStuff();

        // THEN
        Mockito.verify(troublesomeDependency).doInsaneStuffInDatasbase();
    }

}
