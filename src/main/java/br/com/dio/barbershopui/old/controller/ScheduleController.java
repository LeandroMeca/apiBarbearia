//package br.com.dio.barbershopui.old.controller;
//
//
//import br.com.dio.barbershopui.old.controller.response.ScheduleAppointmentMonthResponse;
//import br.com.dio.barbershopui.old.entity.ScheduleEntity;
//import br.com.dio.barbershopui.old.repository.IScheduleRepository;
//import jakarta.validation.Valid;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.YearMonth;
//
//import static java.time.ZoneOffset.UTC;
//
//
//@RestController
//@RequestMapping("schedules")
//public class ScheduleController {
//
//    IScheduleRepository repository;
//
//    @PostMapping
//    public void save(@RequestBody @Valid ScheduleEntity request){
//        repository.save(request);
//    }
//
//    @DeleteMapping("{id}")
//    void delete(@PathVariable long id){
//       repository.deleteById(id);
//    }
//
//    @GetMapping("{year}/{month}")
//    ScheduleAppointmentMonthResponse listMonth(@PathVariable final int year, @PathVariable final int month){
//        var yearMonth = YearMonth.of(year, month);
//        var startAt = yearMonth.atDay(1)
//                .atTime(0, 0, 0, 0)
//                .atOffset(UTC);
//        var endAt = yearMonth.atEndOfMonth()
//                .atTime(23, 59, 59, 999_999_999)
//                .atOffset(UTC);
//
////        var entities = repository.  (startAt, endAt);
////        return mapper.toMonthResponse(year, month, entities);
//        return null;
//    }
//}
