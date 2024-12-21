package fit.iuh.se.impl;

import fit.iuh.se.dao.BusrouteRepository;
import fit.iuh.se.entity.Busroute;
import fit.iuh.se.service.BusrouteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusrouteServiceImpl implements BusrouteService {

    private final BusrouteRepository busrouteRepository;

    public BusrouteServiceImpl (BusrouteRepository busrouteRepository){
        this.busrouteRepository = busrouteRepository;
    }

    @Override
    public List<Busroute> getAllBusroutes(){
        return busrouteRepository.findAll();
    }
    @Override
    public Busroute getBusrouteById(int id){
        return busrouteRepository.findById(id).orElse(null);
    }

    @Override
    public Busroute saveBusroute(Busroute busroute){
        return busrouteRepository.save(busroute);
    }

    @Override
    public void deleBusrouteById(int id){
        busrouteRepository.deleteById(id);
    }
}
