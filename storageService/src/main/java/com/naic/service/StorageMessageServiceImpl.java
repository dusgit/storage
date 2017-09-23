package com.naic.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naic.mapper.StorageMessageMapper;
import com.naic.po.StorageMessage;

@Service
public class StorageMessageServiceImpl implements StorageMessageService {

	@Autowired
	private StorageMessageMapper storageMessageMapper;
	
	@Override
	public List<StorageMessage> send() {
		
		return storageMessageMapper.findStorageMessageList();
	}

}
