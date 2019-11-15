package br.com.beibe.beans;

import java.util.Date;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("serial")
public final class Ticket implements Bean {

    private Long id;
    private Date openingDate;
    private Date closingDate;
    private TicketStatus status;
    private TicketType type;
    private User oepnBy;
    private Set<TicketMessage> messages;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOpeningDate() {
        return this.openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public Date getClosingDate() {
        return this.closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    public TicketStatus getStatus() {
        return this.status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public TicketType getType() {
        return this.type;
    }

    public void setType(TicketType type) {
        this.type = type;
    }

    public User getOepnBy() {
        return this.oepnBy;
    }

    public void setOepnBy(User oepnBy) {
        this.oepnBy = oepnBy;
    }

    public Set<TicketMessage> getMessages() {
        return this.messages;
    }

    public void setMessages(Set<TicketMessage> messages) {
        this.messages = messages;
    }

    @Override
    public List<ValError> validate() {
        List<ValError> errors = new ArrayList<>();
        return errors;
    }
}
