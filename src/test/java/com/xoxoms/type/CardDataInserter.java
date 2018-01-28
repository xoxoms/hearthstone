package com.xoxoms.type;

import com.google.common.collect.Lists;
import com.xoxoms.attribute.MinionAttributeMap;
import com.xoxoms.card.CardData;
import com.xoxoms.support.util.JsonUtils;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


/**
 * Created by ms on 2018. 1. 24..
 */
public class CardDataInserter {
    private EntityManagerFactory emf;

    @Before
    public void setUp() {
        emf = Persistence.createEntityManagerFactory("jpa");
    }

    @Test
    public void test() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("/Users/home/Documents/hearth.json"));
            String s;
            List<CardData> datas = Lists.newArrayList();

            while ((s = in.readLine()) != null) {
                datas.add(JsonUtils.fromJson(s, CardData.class));
            }

            EntityManager em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            datas.forEach(em::persist);
            tx.commit();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testForInsertAttributes() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        TypedQuery<CardData> query = em.createQuery("select m from CardData m", CardData.class);

        tx.begin();

        query.getResultList().stream()
                .filter(item -> item.getSetValue().equals("CORE") || item.getSetValue().equals("EXPERT1"))
                .filter(item -> item.getType().equals("MINION"))
                .forEach(item -> {
            Long ATTRIBUTE_ID = 1L;
            if(item.getSecret().equals("true")) {
                MinionAttributeMap newOne = new MinionAttributeMap();
                newOne.setTemp(item.getGameId());
                newOne.setAttributeId(ATTRIBUTE_ID);

                em.persist(newOne);
            }
            ATTRIBUTE_ID++;
            if(item.getEnraged().equals("true")) {
                MinionAttributeMap newOne = new MinionAttributeMap();
                newOne.setTemp(item.getGameId());
                newOne.setAttributeId(ATTRIBUTE_ID);

                em.persist(newOne);
            }
            ATTRIBUTE_ID++;
            if(item.getTaunt().equals("true")) {
                MinionAttributeMap newOne = new MinionAttributeMap();
                newOne.setTemp(item.getGameId());
                newOne.setAttributeId(ATTRIBUTE_ID);

                em.persist(newOne);
            }
            ATTRIBUTE_ID++;
            if(item.getDeathrattle().equals("true")) {
                MinionAttributeMap newOne = new MinionAttributeMap();
                newOne.setTemp(item.getGameId());
                newOne.setAttributeId(ATTRIBUTE_ID);

                em.persist(newOne);
            }
            ATTRIBUTE_ID++;
            if(item.getBattlecry().equals("true")) {
                MinionAttributeMap newOne = new MinionAttributeMap();
                newOne.setTemp(item.getGameId());
                newOne.setAttributeId(ATTRIBUTE_ID);

                em.persist(newOne);
            }
            ATTRIBUTE_ID++;
            if(item.getSilence().equals("true")) {
                MinionAttributeMap newOne = new MinionAttributeMap();
                newOne.setTemp(item.getGameId());
                newOne.setAttributeId(ATTRIBUTE_ID);

                em.persist(newOne);
            }
            ATTRIBUTE_ID++;
            if(item.getCharge().equals("true")) {
                MinionAttributeMap newOne = new MinionAttributeMap();
                newOne.setTemp(item.getGameId());
                newOne.setAttributeId(ATTRIBUTE_ID);

                em.persist(newOne);
            }
            ATTRIBUTE_ID++;
            if(item.getInspire().equals("true")) {
                MinionAttributeMap newOne = new MinionAttributeMap();
                newOne.setTemp(item.getGameId());
                newOne.setAttributeId(ATTRIBUTE_ID);

                em.persist(newOne);
            }
            ATTRIBUTE_ID++;
            if(item.getOverload().equals("true")) {
                MinionAttributeMap newOne = new MinionAttributeMap();
                newOne.setTemp(item.getGameId());
                newOne.setAttributeId(ATTRIBUTE_ID);

                em.persist(newOne);
            }
            ATTRIBUTE_ID++;
            if(item.getAura().equals("true")) {
                MinionAttributeMap newOne = new MinionAttributeMap();
                newOne.setTemp(item.getGameId());
                newOne.setAttributeId(ATTRIBUTE_ID);

                em.persist(newOne);
            }
            ATTRIBUTE_ID++;
            if(item.getCombo().equals("true")) {
                MinionAttributeMap newOne = new MinionAttributeMap();
                newOne.setTemp(item.getGameId());
                newOne.setAttributeId(ATTRIBUTE_ID);

                em.persist(newOne);
            }
            ATTRIBUTE_ID++;
            if(item.getFreeze().equals("true")) {
                MinionAttributeMap newOne = new MinionAttributeMap();
                newOne.setTemp(item.getGameId());
                newOne.setAttributeId(ATTRIBUTE_ID);

                em.persist(newOne);
            }
            ATTRIBUTE_ID++;
            if(item.getSpellpower().equals("true")) {
                MinionAttributeMap newOne = new MinionAttributeMap();
                newOne.setTemp(item.getGameId());
                newOne.setAttributeId(ATTRIBUTE_ID);

                em.persist(newOne);
            }
            ATTRIBUTE_ID++;
            if(item.getStealth().equals("true")) {
                MinionAttributeMap newOne = new MinionAttributeMap();
                newOne.setTemp(item.getGameId());
                newOne.setAttributeId(ATTRIBUTE_ID);

                em.persist(newOne);
            }
            ATTRIBUTE_ID++;
            if(item.getWindfury().equals("true")) {
                MinionAttributeMap newOne = new MinionAttributeMap();
                newOne.setTemp(item.getGameId());
                newOne.setAttributeId(ATTRIBUTE_ID);

                em.persist(newOne);
            }
            ATTRIBUTE_ID++;
            if(item.getDivineShield().equals("true")) {
                MinionAttributeMap newOne = new MinionAttributeMap();
                newOne.setTemp(item.getGameId());
                newOne.setAttributeId(ATTRIBUTE_ID);

                em.persist(newOne);
            }
            ATTRIBUTE_ID++;
            if(item.getPoisonous().equals("true")) {
                MinionAttributeMap newOne = new MinionAttributeMap();
                newOne.setTemp(item.getGameId());
                newOne.setAttributeId(ATTRIBUTE_ID);

                em.persist(newOne);
            }
            ATTRIBUTE_ID++;
            if(item.getForgetful().equals("true")) {
                MinionAttributeMap newOne = new MinionAttributeMap();
                newOne.setTemp(item.getGameId());
                newOne.setAttributeId(ATTRIBUTE_ID);

                em.persist(newOne);
            }
        });

        tx.commit();
    }
}