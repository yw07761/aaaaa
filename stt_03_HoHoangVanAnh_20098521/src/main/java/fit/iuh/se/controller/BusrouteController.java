package fit.iuh.se.controller;

import fit.iuh.se.entity.Busroute;
import fit.iuh.se.service.BusrouteService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BlindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/busroutes")
public class BusrouteController {
    private final BusrouteService busrouteService;

    public  BusrouteController(BusrouteService busrouteService){
        this.busrouteService=busrouteService;
    }

    @GetMapping
    public String showAddBusrouteForm(Model model){
        model.addAttribute("busroute", new Busroute());
        return "busroute/add";
    }

    @PostMapping
    public String addBusroute(@Valid @ModelAttribute("busroute") Busroute busroute, BlindingResult result, Model model){
        if(result.hasErrors()){
            return "busroute/add";
        }
        busrouteService.saveBusroute(busroute);
        return "redirect:/busroutes";
    }

    @GetMapping("/{id}/delete")
    public String deleteBusroute(@PathVariable int id){
        busrouteService.deleBusrouteById(id);
        return "redirect:/busroute";
    }
}
