package com.projet6.contrat;

import com.projet6.Impl.Topo;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface TopoDao {

    void addTopo();
    void updateTopo();
    void deleteTopo();
    List<Topo> getlistAvailableTopo();
    List<Topo> getlistAllTopo();
}
