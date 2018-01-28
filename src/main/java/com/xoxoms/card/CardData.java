package com.xoxoms.card;

import javax.persistence.*;

/**
 * Created by ms on 2018. 1. 28..
 */
@Entity
@Table(name = "CARD_DATA_M")
public class CardData {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "text")
    private String text;
    @Column(name = "howToEarn")
    private String howToEarn;
    @Column(name = "howToEarnGolden")
    private String howToEarnGolden;
    @Column(name = "flavor")
    private String flavor;
    @Column(name = "targetingArrowText")
    private String targetingArrowText;
    @Column(name = "gameId")
    private String gameId;
    @Column(name = "setValue")
    private String setValue;
    @Column(name = "cost")
    private String cost;
    @Column(name = "attack")
    private String attack;
    @Column(name = "health")
    private String health;
    @Column(name = "rarity")
    private String rarity;
    @Column(name = "type")
    private String type;
    @Column(name = "collectible")
    private String collectible;
    @Column(name = "dustNew")
    private String dustNew;
    @Column(name = "dustBreak")
    private String dustBreak;
    @Column(name = "dustNewGold")
    private String dustNewGold;
    @Column(name = "dustBreakGold")
    private String dustBreakGold;
    @Column(name = "playerClass")
    private String playerClass;
    @Column(name = "secret")
    private String secret;
    @Column(name = "enraged")
    private String enraged;
    @Column(name = "taunt")
    private String taunt;
    @Column(name = "deathrattle")
    private String deathrattle;
    @Column(name = "battlecry")
    private String battlecry;
    @Column(name = "silence")
    private String silence;
    @Column(name = "charge")
    private String charge;
    @Column(name = "inspire")
    private String inspire;
    @Column(name = "overload")
    private String overload;
    @Column(name = "aura")
    private String aura;
    @Column(name = "combo")
    private String combo;
    @Column(name = "freeze")
    private String freeze;
    @Column(name = "spellpower")
    private String spellpower;
    @Column(name = "stealth")
    private String stealth;
    @Column(name = "windfury")
    private String windfury;
    @Column(name = "divineShield")
    private String divineShield;
    @Column(name = "poisonous")
    private String poisonous;
    @Column(name = "forgetful")
    private String forgetful;
    @Column(name = "race")
    private String race;
    @Column(name = "faction")
    private String faction;
    @Column(name = "artist")
    private String artist;
    @Column(name = "hearthheadId")
    private Long hearthheadId;
    @Column(name = "texture")
    private String texture;
    @Column(name = "hearthheadURL")
    private String hearthheadURL;
    @Column(name = "textMarkdown")
    private String textMarkdown;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHowToEarn() {
        return howToEarn;
    }

    public void setHowToEarn(String howToEarn) {
        this.howToEarn = howToEarn;
    }

    public String getHowToEarnGolden() {
        return howToEarnGolden;
    }

    public void setHowToEarnGolden(String howToEarnGolden) {
        this.howToEarnGolden = howToEarnGolden;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getTargetingArrowText() {
        return targetingArrowText;
    }

    public void setTargetingArrowText(String targetingArrowText) {
        this.targetingArrowText = targetingArrowText;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getSetValue() {
        return setValue;
    }

    public void setSetValue(String setValue) {
        this.setValue = setValue;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCollectible() {
        return collectible;
    }

    public void setCollectible(String collectible) {
        this.collectible = collectible;
    }

    public String getDustNew() {
        return dustNew;
    }

    public void setDustNew(String dustNew) {
        this.dustNew = dustNew;
    }

    public String getDustBreak() {
        return dustBreak;
    }

    public void setDustBreak(String dustBreak) {
        this.dustBreak = dustBreak;
    }

    public String getDustNewGold() {
        return dustNewGold;
    }

    public void setDustNewGold(String dustNewGold) {
        this.dustNewGold = dustNewGold;
    }

    public String getDustBreakGold() {
        return dustBreakGold;
    }

    public void setDustBreakGold(String dustBreakGold) {
        this.dustBreakGold = dustBreakGold;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getEnraged() {
        return enraged;
    }

    public void setEnraged(String enraged) {
        this.enraged = enraged;
    }

    public String getTaunt() {
        return taunt;
    }

    public void setTaunt(String taunt) {
        this.taunt = taunt;
    }

    public String getDeathrattle() {
        return deathrattle;
    }

    public void setDeathrattle(String deathrattle) {
        this.deathrattle = deathrattle;
    }

    public String getBattlecry() {
        return battlecry;
    }

    public void setBattlecry(String battlecry) {
        this.battlecry = battlecry;
    }

    public String getSilence() {
        return silence;
    }

    public void setSilence(String silence) {
        this.silence = silence;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getInspire() {
        return inspire;
    }

    public void setInspire(String inspire) {
        this.inspire = inspire;
    }

    public String getOverload() {
        return overload;
    }

    public void setOverload(String overload) {
        this.overload = overload;
    }

    public String getAura() {
        return aura;
    }

    public void setAura(String aura) {
        this.aura = aura;
    }

    public String getCombo() {
        return combo;
    }

    public void setCombo(String combo) {
        this.combo = combo;
    }

    public String getFreeze() {
        return freeze;
    }

    public void setFreeze(String freeze) {
        this.freeze = freeze;
    }

    public String getSpellpower() {
        return spellpower;
    }

    public void setSpellpower(String spellpower) {
        this.spellpower = spellpower;
    }

    public String getStealth() {
        return stealth;
    }

    public void setStealth(String stealth) {
        this.stealth = stealth;
    }

    public String getWindfury() {
        return windfury;
    }

    public void setWindfury(String windfury) {
        this.windfury = windfury;
    }

    public String getDivineShield() {
        return divineShield;
    }

    public void setDivineShield(String divineShield) {
        this.divineShield = divineShield;
    }

    public String getPoisonous() {
        return poisonous;
    }

    public void setPoisonous(String poisonous) {
        this.poisonous = poisonous;
    }

    public String getForgetful() {
        return forgetful;
    }

    public void setForgetful(String forgetful) {
        this.forgetful = forgetful;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Long getHearthheadId() {
        return hearthheadId;
    }

    public void setHearthheadId(Long hearthheadId) {
        this.hearthheadId = hearthheadId;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getHearthheadURL() {
        return hearthheadURL;
    }

    public void setHearthheadURL(String hearthheadURL) {
        this.hearthheadURL = hearthheadURL;
    }

    public String getTextMarkdown() {
        return textMarkdown;
    }

    public void setTextMarkdown(String textMarkdown) {
        this.textMarkdown = textMarkdown;
    }
}
