package com.gruposei.gestion_orquestas.service;

import com.gruposei.gestion_orquestas.model.Show;
import com.gruposei.gestion_orquestas.model.Ticket;
import com.gruposei.gestion_orquestas.model.User;
import com.gruposei.gestion_orquestas.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private ShowService showService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public Ticket create(Long user_id, Long show_id){

        Optional<User> user = userService.findById(user_id);
        Optional<Show> show = showService.findById(show_id);

        Ticket ticket = new Ticket();
        ticket.setUser(user.get());
        ticket.setShow(show.get());
        ticket.buildCode();
        String encodedCode = bCryptPasswordEncoder.encode(ticket.getCode());
        ticket.setCode(encodedCode);
        ticket.setUsed(false);
        ticket.setPurchaseDate(new Date(System.currentTimeMillis()));

        return ticketRepository.save(ticket);
    }

    public Ticket update(Ticket ticket){

        return ticketRepository.save(ticket);
    }

    public List<Ticket> getAll(){

        return ticketRepository.findAll();
    }

    public void delete(Ticket p){

        ticketRepository.delete(p);
    }

    public void deleteById(Long id){

        ticketRepository.deleteById(id);
    }

    public void deleteByCode(String code){

        ticketRepository.deleteByCode(code);
    }

    public void deleteByUserAndShow(User user, Show show){

        ticketRepository.deleteByUserAndShow(user,show);
    }

    public Optional<Ticket> findById(Long id){

        return ticketRepository.findById(id);
    }

    public List<Optional<Ticket>> findByUser(User user){

        return ticketRepository.findByUser(user);
    }

    public List<Optional<Ticket>> findByShow(Show show){

        return ticketRepository.findByShow(show);
    }

    public Optional<Ticket> findByCode(String code){

        return ticketRepository.findByCode(code);
    }
}
