package fiap.scj34.rest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fiap.scj34.rest.models.Vehicle;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
	
	private static final List<Vehicle> LIST_VEHICLES = new ArrayList<Vehicle>();
	static {
		LIST_VEHICLES.add(new Vehicle(1, "Ford", "Mustang", "EJB-4575", 2018, "Vermelho"));
	}
	
	@GetMapping
	public List<Vehicle> getAllVehicle(){
		return LIST_VEHICLES;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Vehicle> getVehicleById( @PathVariable(value="id") Integer id) {
		for(Vehicle vehicle : LIST_VEHICLES) {
			if(id.equals(vehicle.getId())) {
				return ResponseEntity.ok(vehicle);
			}
		}		
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	public void saveVehicle(Vehicle vehicle) {
		LIST_VEHICLES.add(vehicle);
	}
	
//	public Vehicle updateVehicle(Integer id, Vehicle vehicle) {}
//	
//	public Vehicle deleteVehicle(Integer id) {}
}
