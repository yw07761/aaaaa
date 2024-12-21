package fit.iuh.se.service;

import fit.iuh.se.entity.Busroute;

import java.util.List;

public interface BusrouteService {
        List<Busroute> getAllBusroutes();
        Busroute getBusrouteById(int id);
        Busroute saveBusroute(Busroute busroute);
        void deleBusrouteById(int id);
}
