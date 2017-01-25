package com.uragan.DAO;

import java.util.List;

import com.uragan.model.Sector;

public interface SectorDAO {

  Sector findById(int id);

  List<Sector> findAllSector();

  void save(Sector sector);

}
