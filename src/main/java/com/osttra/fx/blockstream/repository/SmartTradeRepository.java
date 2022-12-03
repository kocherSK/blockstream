package com.osttra.fx.blockstream.repository;

import com.osttra.fx.blockstream.domain.SmartTrade;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the SmartTrade entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SmartTradeRepository extends MongoRepository<SmartTrade, String> {}
