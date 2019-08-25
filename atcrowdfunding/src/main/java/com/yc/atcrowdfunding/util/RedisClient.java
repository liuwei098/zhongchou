package com.yc.atcrowdfunding.util;

import java.util.ArrayList;
import java.util.List;

import redis.clients.jedis.*;





public class RedisClient {
	private Jedis jedis=new Jedis("localhost");//非切片客户端连接
	private JedisPool jedisPool;//非掐片连接池
	private ShardedJedis sharedJedis;//切片客户端连接
	private ShardedJedisPool sharedJedisPool;
	private static RedisClient client;
	public Jedis getJedis() {
		return jedis;
	}
	public ShardedJedis getSharedJedis() {
		return sharedJedis;
	}
	
	public static RedisClient getInstance(){
		if(client==null){
			client=new RedisClient();
		}
		return client;
	}
	
	/*private RedisClient(){
		if(sharedJedisPool==null){
			initialSharedPool();
			sharedJedis=sharedJedisPool.getResource();
		}
		if(jedis==null){
			initialPool();
			jedis=jedisPool.getResource();
		}
	}*/
	
	/*private void initialSharedPool() {
		JedisPoolConfig config=new JedisPoolConfig();
		//jedisPool=new JedisPool(config,"127.0.0.1",6379);
	}
	
	private void initialPool(){
		JedisPoolConfig config=new JedisPoolConfig();
		List<JedisShardInfo> shards=new ArrayList<>();
		shards.add(new JedisShardInfo("127.0.0.1",6379,"master"));
	}*/
}
