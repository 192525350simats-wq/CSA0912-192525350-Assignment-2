package parking.service;
import parking.model.ParkingSlot;
public class ParkingService {public boolean park(ParkingSlot slot,String reg){return slot.occupy(reg);}public boolean leave(ParkingSlot slot){return slot.release();}}
