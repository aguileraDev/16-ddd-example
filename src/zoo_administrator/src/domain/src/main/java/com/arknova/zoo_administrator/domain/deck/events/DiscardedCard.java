package com.arknova.zoo_administrator.domain.deck.events;

import com.arknova.shared.domain.generic.DomainEvent;

import java.time.Instant;

public class DiscardedCard extends DomainEvent {
    private final String deckId;
    private final String cardId;
    private final Instant when;


    public DiscardedCard(String cardId, String deckId, Instant when) {
        super(EventsEnum.DISCARDED_CARD.name());
        this.cardId = cardId;
        this.deckId = deckId;
        this.when = when;

    }

    public String getCardId() {
        return cardId;
    }

    public String getDeckId() {
        return deckId;
    }

    @Override
    public Instant getWhen() {
        return when;
    }

}
