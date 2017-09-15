package com.naic.mapper;

import java.util.List;

import com.naic.po.StorageMessage;

public interface StorageMessageMapper {
	public List<StorageMessage> findTradeMessageList();
}
