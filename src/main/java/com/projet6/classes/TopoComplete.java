package com.projet6.classes;

import com.projet6.Impl.Secteur;
import com.projet6.Impl.Topo;
import com.projet6.Impl.Voie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TopoComplete {
   public TopoAPI topo ;

   @Override
   public String toString() {
      return "TopoComplete{" +
              "topo=" + topo +
              ", secteur=" + Arrays.toString(secteur) +
              ", voie=" + Arrays.toString(voie) +
              '}';
   }

   public Secteur[] secteur ;
   public Voie[] voie;

}

