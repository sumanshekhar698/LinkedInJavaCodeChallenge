package com.sumanshekhar.challenges.novice._05Ticket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketHolderTest {

    @Test
    public void attributes() {

        TicketHolder ticketHolder =
                new TicketHolder("Sally Roberts", 3);
        assertEquals("Sally Roberts", ticketHolder.getName());
        assertEquals(3, ticketHolder.getQuantity());

        ticketHolder.setName("Kristen Johnson");
        ticketHolder.setQuantity(2);
        assertEquals("Kristen Johnson", ticketHolder.getName());
        assertEquals(2, ticketHolder.getQuantity());
    }
}