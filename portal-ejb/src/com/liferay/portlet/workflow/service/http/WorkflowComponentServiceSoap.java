/**
 * Copyright (c) 2000-2006 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.workflow.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StackTraceUtil;

import com.liferay.portlet.workflow.service.WorkflowComponentServiceUtil;

import java.rmi.RemoteException;

/**
 * <a href="WorkflowComponentServiceSoap.java.html"><b><i>View Source</i></b></a>
 *
 * @author  Brian Wing Shun Chan
 *
 */
public class WorkflowComponentServiceSoap {
	public static java.util.List getCurrentTasks(long instanceId, long tokenId)
		throws RemoteException {
		try {
			java.util.List returnValue = WorkflowComponentServiceUtil.getCurrentTasks(instanceId,
					tokenId);

			return returnValue;
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static java.lang.String getCurrentTasksXml(long instanceId,
		long tokenId) throws RemoteException {
		try {
			java.lang.String returnValue = WorkflowComponentServiceUtil.getCurrentTasksXml(instanceId,
					tokenId);

			return returnValue;
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static java.lang.String deploy(java.lang.String xml)
		throws RemoteException {
		try {
			java.lang.String returnValue = WorkflowComponentServiceUtil.deploy(xml);

			return returnValue;
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static java.util.List getDefinitions(long definitionId,
		java.lang.String name, int begin, int end) throws RemoteException {
		try {
			java.util.List returnValue = WorkflowComponentServiceUtil.getDefinitions(definitionId,
					name, begin, end);

			return returnValue;
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static java.lang.String getDefinitionsXml(long definitionId,
		java.lang.String name, int begin, int end) throws RemoteException {
		try {
			java.lang.String returnValue = WorkflowComponentServiceUtil.getDefinitionsXml(definitionId,
					name, begin, end);

			return returnValue;
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static int getDefinitionsCount(long definitionId,
		java.lang.String name) throws RemoteException {
		try {
			int returnValue = WorkflowComponentServiceUtil.getDefinitionsCount(definitionId,
					name);

			return returnValue;
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static java.lang.String getDefinitionsCountXml(long definitionId,
		java.lang.String name) throws RemoteException {
		try {
			java.lang.String returnValue = WorkflowComponentServiceUtil.getDefinitionsCountXml(definitionId,
					name);

			return returnValue;
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static java.util.List getInstances(long definitionId,
		long instanceId, java.lang.String definitionName,
		java.lang.String definitionVersion, java.lang.String startDateGT,
		java.lang.String startDateLT, java.lang.String endDateGT,
		java.lang.String endDateLT, boolean hideEndedTasks,
		boolean andOperator, int begin, int end) throws RemoteException {
		try {
			java.util.List returnValue = WorkflowComponentServiceUtil.getInstances(definitionId,
					instanceId, definitionName, definitionVersion, startDateGT,
					startDateLT, endDateGT, endDateLT, hideEndedTasks,
					andOperator, begin, end);

			return returnValue;
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static int getInstancesCount(long definitionId, long instanceId,
		java.lang.String definitionName, java.lang.String definitionVersion,
		java.lang.String startDateGT, java.lang.String startDateLT,
		java.lang.String endDateGT, java.lang.String endDateLT,
		boolean hideEndedTasks, boolean andOperator) throws RemoteException {
		try {
			int returnValue = WorkflowComponentServiceUtil.getInstancesCount(definitionId,
					instanceId, definitionName, definitionVersion, startDateGT,
					startDateLT, endDateGT, endDateLT, hideEndedTasks,
					andOperator);

			return returnValue;
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static java.lang.String getInstancesCountXml(long definitionId,
		long instanceId, java.lang.String definitionName,
		java.lang.String definitionVersion, java.lang.String startDateGT,
		java.lang.String startDateLT, java.lang.String endDateGT,
		java.lang.String endDateLT, boolean hideEndedTasks, boolean andOperator)
		throws RemoteException {
		try {
			java.lang.String returnValue = WorkflowComponentServiceUtil.getInstancesCountXml(definitionId,
					instanceId, definitionName, definitionVersion, startDateGT,
					startDateLT, endDateGT, endDateLT, hideEndedTasks,
					andOperator);

			return returnValue;
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static java.lang.String getInstancesXml(long definitionId,
		long instanceId, java.lang.String definitionName,
		java.lang.String definitionVersion, java.lang.String startDateGT,
		java.lang.String startDateLT, java.lang.String endDateGT,
		java.lang.String endDateLT, boolean hideEndedTasks,
		boolean andOperator, int begin, int end) throws RemoteException {
		try {
			java.lang.String returnValue = WorkflowComponentServiceUtil.getInstancesXml(definitionId,
					instanceId, definitionName, definitionVersion, startDateGT,
					startDateLT, endDateGT, endDateLT, hideEndedTasks,
					andOperator, begin, end);

			return returnValue;
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static java.util.List getTaskFormElements(long taskId)
		throws RemoteException {
		try {
			java.util.List returnValue = WorkflowComponentServiceUtil.getTaskFormElements(taskId);

			return returnValue;
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static java.lang.String getTaskFormElementsXml(long taskId)
		throws RemoteException {
		try {
			java.lang.String returnValue = WorkflowComponentServiceUtil.getTaskFormElementsXml(taskId);

			return returnValue;
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static java.util.List getTaskTransitions(long taskId)
		throws RemoteException {
		try {
			java.util.List returnValue = WorkflowComponentServiceUtil.getTaskTransitions(taskId);

			return returnValue;
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static java.lang.String getTaskTransitionsXml(long taskId)
		throws RemoteException {
		try {
			java.lang.String returnValue = WorkflowComponentServiceUtil.getTaskTransitionsXml(taskId);

			return returnValue;
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static java.util.List getUserTasks(long instanceId,
		java.lang.String taskName, java.lang.String definitionName,
		java.lang.String assignedTo, java.lang.String createDateGT,
		java.lang.String createDateLT, java.lang.String startDateGT,
		java.lang.String startDateLT, java.lang.String endDateGT,
		java.lang.String endDateLT, boolean hideEndedTasks,
		boolean andOperator, int begin, int end) throws RemoteException {
		try {
			java.util.List returnValue = WorkflowComponentServiceUtil.getUserTasks(instanceId,
					taskName, definitionName, assignedTo, createDateGT,
					createDateLT, startDateGT, startDateLT, endDateGT,
					endDateLT, hideEndedTasks, andOperator, begin, end);

			return returnValue;
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static int getUserTasksCount(long instanceId,
		java.lang.String taskName, java.lang.String definitionName,
		java.lang.String assignedTo, java.lang.String createDateGT,
		java.lang.String createDateLT, java.lang.String startDateGT,
		java.lang.String startDateLT, java.lang.String endDateGT,
		java.lang.String endDateLT, boolean hideEndedTasks, boolean andOperator)
		throws RemoteException {
		try {
			int returnValue = WorkflowComponentServiceUtil.getUserTasksCount(instanceId,
					taskName, definitionName, assignedTo, createDateGT,
					createDateLT, startDateGT, startDateLT, endDateGT,
					endDateLT, hideEndedTasks, andOperator);

			return returnValue;
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static java.lang.String getUserTasksCountXml(long instanceId,
		java.lang.String taskName, java.lang.String definitionName,
		java.lang.String assignedTo, java.lang.String createDateGT,
		java.lang.String createDateLT, java.lang.String startDateGT,
		java.lang.String startDateLT, java.lang.String endDateGT,
		java.lang.String endDateLT, boolean hideEndedTasks, boolean andOperator)
		throws RemoteException {
		try {
			java.lang.String returnValue = WorkflowComponentServiceUtil.getUserTasksCountXml(instanceId,
					taskName, definitionName, assignedTo, createDateGT,
					createDateLT, startDateGT, startDateLT, endDateGT,
					endDateLT, hideEndedTasks, andOperator);

			return returnValue;
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static java.lang.String getUserTasksXml(long instanceId,
		java.lang.String taskName, java.lang.String definitionName,
		java.lang.String assignedTo, java.lang.String createDateGT,
		java.lang.String createDateLT, java.lang.String startDateGT,
		java.lang.String startDateLT, java.lang.String endDateGT,
		java.lang.String endDateLT, boolean hideEndedTasks,
		boolean andOperator, int begin, int end) throws RemoteException {
		try {
			java.lang.String returnValue = WorkflowComponentServiceUtil.getUserTasksXml(instanceId,
					taskName, definitionName, assignedTo, createDateGT,
					createDateLT, startDateGT, startDateLT, endDateGT,
					endDateLT, hideEndedTasks, andOperator, begin, end);

			return returnValue;
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static void signalInstance(long instanceId)
		throws RemoteException {
		try {
			WorkflowComponentServiceUtil.signalInstance(instanceId);
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static void signalToken(long instanceId, long tokenId)
		throws RemoteException {
		try {
			WorkflowComponentServiceUtil.signalToken(instanceId, tokenId);
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	public static java.lang.String startWorkflow(long definitionId)
		throws RemoteException {
		try {
			java.lang.String returnValue = WorkflowComponentServiceUtil.startWorkflow(definitionId);

			return returnValue;
		}
		catch (Exception e) {
			String stackTrace = StackTraceUtil.getStackTrace(e);
			_log.error(stackTrace);
			throw new RemoteException(stackTrace);
		}
	}

	private static Log _log = LogFactoryUtil.getLog(WorkflowComponentServiceSoap.class);
}