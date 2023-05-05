package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TicketManagerTest {
    @Test
    public void testSortingTicketsIfMany() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "LED", "SVO", 1999, 112);
        Ticket ticket2 = new Ticket(2, "LED", "SVO", 2999, 112);
        Ticket ticket3 = new Ticket(3, "LED", "TUY", 1909, 552);
        Ticket ticket4 = new Ticket(4, "TUT", "SVO", 1999, 178);
        Ticket ticket5 = new Ticket(5, "LED", "SVO", 5099, 77);
        Ticket ticket6 = new Ticket(6, "REW", "SVO", 1900, 99);
        Ticket ticket7 = new Ticket(7, "GED", "SVO", 4399, 99);
        Ticket ticket8 = new Ticket(8, "LED", "SVO", 1998, 100);
        Ticket ticket9 = new Ticket(9, "WET", "SVO", 1999, 112);
        Ticket ticket10 = new Ticket(10, "LED", "SVO", 1999, 112);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] expected = {ticket8, ticket1, ticket10, ticket2, ticket5};
        Ticket[] actual = manager.findAll("LED", "SVO");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortingTicketsIfOne() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "LED", "SVO", 1999, 112);
        Ticket ticket2 = new Ticket(2, "LED", "SVO", 2999, 112);
        Ticket ticket3 = new Ticket(3, "LED", "TUY", 1909, 552);
        Ticket ticket4 = new Ticket(4, "TUT", "SVO", 1999, 178);
        Ticket ticket5 = new Ticket(5, "LED", "SVO", 5099, 77);
        Ticket ticket6 = new Ticket(6, "REW", "SVO", 1900, 99);
        Ticket ticket7 = new Ticket(7, "GED", "SVO", 4399, 99);
        Ticket ticket8 = new Ticket(8, "LED", "SVO", 1998, 100);
        Ticket ticket9 = new Ticket(9, "WET", "SVO", 1999, 112);
        Ticket ticket10 = new Ticket(10, "LED", "SVO", 1999, 112);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] expected = {ticket7};
        Ticket[] actual = manager.findAll("GED", "SVO");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortingTicketsIfZero() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "LED", "SVO", 1999, 112);
        Ticket ticket2 = new Ticket(2, "LED", "SVO", 2999, 112);
        Ticket ticket3 = new Ticket(3, "LED", "TUY", 1909, 552);
        Ticket ticket4 = new Ticket(4, "TUT", "SVO", 1999, 178);
        Ticket ticket5 = new Ticket(5, "LED", "SVO", 5099, 77);
        Ticket ticket6 = new Ticket(6, "REW", "SVO", 1900, 99);
        Ticket ticket7 = new Ticket(7, "GED", "SVO", 4399, 99);
        Ticket ticket8 = new Ticket(8, "LED", "SVO", 1998, 100);
        Ticket ticket9 = new Ticket(9, "WET", "SVO", 1999, 112);
        Ticket ticket10 = new Ticket(10, "LED", "SVO", 1999, 112);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("GED", "LED");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortingTicketsIfManySorted() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "LED", "SVO", 199, 112);
        Ticket ticket2 = new Ticket(2, "LED", "SVO", 299, 112);
        Ticket ticket3 = new Ticket(3, "LED", "TUY", 1909, 552);
        Ticket ticket4 = new Ticket(4, "TUT", "SVO", 1999, 178);
        Ticket ticket5 = new Ticket(5, "LED", "SVO", 399, 77);
        Ticket ticket6 = new Ticket(6, "REW", "SVO", 1900, 99);
        Ticket ticket7 = new Ticket(7, "GED", "SVO", 4399, 99);
        Ticket ticket8 = new Ticket(8, "LED", "SVO", 499, 100);
        Ticket ticket9 = new Ticket(9, "WET", "SVO", 1999, 112);
        Ticket ticket10 = new Ticket(10, "LED", "SVO", 599, 112);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] expected = {ticket1, ticket2, ticket5, ticket8, ticket10};
        Ticket[] actual = manager.findAll("LED", "SVO");

        Assertions.assertArrayEquals(expected, actual);
    }

}