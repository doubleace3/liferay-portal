/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.dynamicdatalists.model.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.dynamicdatalists.model.DDLRecord;
import com.liferay.portlet.dynamicdatalists.model.DDLRecordSet;
import com.liferay.portlet.dynamicdatalists.service.DDLRecordLocalServiceUtil;
import com.liferay.portlet.dynamicdatalists.service.DDLRecordSetLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 */
public class DDLRecordVersionImpl extends DDLRecordVersionBaseImpl {

	public DDLRecordVersionImpl() {
	}

	public DDLRecord getRecord() throws PortalException, SystemException {
		return DDLRecordLocalServiceUtil.getRecord(getRecordId());
	}

	public DDLRecordSet getRecordSet() throws PortalException, SystemException {
		return DDLRecordSetLocalServiceUtil.getRecordSet(getRecordSetId());
	}

}