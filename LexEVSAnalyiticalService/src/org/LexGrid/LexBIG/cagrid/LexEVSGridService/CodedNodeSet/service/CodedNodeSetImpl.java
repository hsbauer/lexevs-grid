/*******************************************************************************
 * Copyright: (c) 2004-2007 Mayo Foundation for Medical Education and 
 * Research (MFMER). All rights reserved. MAYO, MAYO CLINIC, and the
 * triple-shield Mayo logo are trademarks and service marks of MFMER.
 * 
 * Except as contained in the copyright notice above, or as used to identify 
 * MFMER as the author of this software, the trade names, trademarks, service
 * marks, or product names of the copyright holder shall not be used in
 * advertising, promotion or otherwise in connection with this software without
 * prior written authorization of the copyright holder.
 *   
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 *   
 *  		http://www.eclipse.org/legal/epl-v10.html
 * 
 *  		
 *******************************************************************************/
package org.LexGrid.LexBIG.cagrid.LexEVSGridService.CodedNodeSet.service;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.namespace.QName;

import org.LexGrid.LexBIG.DataModel.Collections.LocalNameList;
import org.LexGrid.LexBIG.DataModel.Collections.SortOptionList;
import org.LexGrid.LexBIG.LexBIGService.CodedNodeSet;
import org.LexGrid.LexBIG.LexBIGService.CodedNodeSet.PropertyType;
import org.LexGrid.LexBIG.Utility.Iterators.ResolvedConceptReferencesIterator;
import org.LexGrid.LexBIG.cagrid.Utils;
import org.LexGrid.LexBIG.cagrid.LexEVSGridService.CodedNodeSet.service.globus.resource.CodedNodeSetResource;
import org.LexGrid.LexBIG.cagrid.iso21090.converter.ConvertUtils;
import org.apache.axis.message.MessageElement;
import org.globus.wsrf.ResourceKey;
import org.globus.wsrf.impl.SimpleResourceKey;

/** 
 * TODO:I am the service side implementation class.  IMPLEMENT AND DOCUMENT ME
 * 
 * @created by Introduce Toolkit version 1.1
 * 
 */
public class CodedNodeSetImpl extends CodedNodeSetImplBase {
	
	public CodedNodeSetImpl() throws RemoteException {
		super();
	}
	

  public org.LexGrid.LexBIG.iso21090.DataModel.Collections.ResolvedConceptReferenceList resolveToList(org.LexGrid.LexBIG.iso21090.DataModel.cagrid.SetResolutionPolicy setResolutionPolicy) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBParameterException {
	  try {
		  SortOptionList sortOptions = ConvertUtils.convert(setResolutionPolicy.getSortOptions(), SortOptionList.class);
		  LocalNameList propertyNames = ConvertUtils.convert(setResolutionPolicy.getPropertyNames(), LocalNameList.class);
		  PropertyType[] propertyTypes = Utils.convertPropertyType(setResolutionPolicy.getPropertyTypes());
		  int maxToReturn = setResolutionPolicy.getMaximumToReturn().getValue();
		  
			return ConvertUtils.convert(getResourceHome().getAddressedResource().getCodedNodeSet().resolveToList(
					sortOptions, 
					propertyNames, 
					propertyTypes, 
					maxToReturn), org.LexGrid.LexBIG.iso21090.DataModel.Collections.ResolvedConceptReferenceList.class);
		} catch (Exception e) {
			Utils.processException(e);
			return null;
		}
	  }
  public void restrictToCodes(org.LexGrid.LexBIG.iso21090.DataModel.Collections.ConceptReferenceList codeList) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBParameterException {
	  try {
		CodedNodeSet cns = getResourceHome().getAddressedResource().getCodedNodeSet();
		cns = cns.restrictToCodes(
				ConvertUtils.convert(codeList, org.LexGrid.LexBIG.DataModel.Collections.ConceptReferenceList.class));
	 
		this.getResourceHome().getAddressedResource().setCodedNodeSet(cns);
	  } catch (Exception e) {
			Utils.processException(e);
	  }
  }

  public org.LexGrid.LexBIG.iso21090.DataModel.cagrid.CodeExistence isCodeInSet(org.LexGrid.LexBIG.iso21090.DataModel.Core.ConceptReference code) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBParameterException {
	  try {
		 boolean isInSet = getResourceHome().getAddressedResource().getCodedNodeSet().isCodeInSet(
				 ConvertUtils.convert(code, org.LexGrid.LexBIG.DataModel.Core.ConceptReference.class)); 
		 return Utils.wrapCodeExistence(isInSet);
	  } catch (Exception e) {
			Utils.processException(e);
			return null;
	  }
  }

  public void restrictToMatchingDesignations(org.LexGrid.LexBIG.iso21090.DataModel.cagrid.MatchCriteria matchCriteria,org.LexGrid.LexBIG.iso21090.DataModel.enums.SearchDesignationOption searchDesignationOption,org.LexGrid.LexBIG.iso21090.DataModel.cagrid.ExtensionIdentification extensionIdentification,org.LexGrid.LexBIG.iso21090.DataModel.cagrid.LanguageIdentification languageIdentification) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBParameterException {
	  try {
		CodedNodeSet cns = getResourceHome().getAddressedResource().getCodedNodeSet();
		CodedNodeSet cnsRestricted = cns.restrictToMatchingDesignations(
				matchCriteria.getText().getValue(), 
				Utils.convertSearchDesignationOption(searchDesignationOption), 
				extensionIdentification.getLexBIGExtensionName().getValue(), 
				languageIdentification.getIdentifier().getValue());
		getResourceHome().getAddressedResource().setCodedNodeSet(cnsRestricted);
	  } catch (Exception e) {
			Utils.processException(e);
	  }
  }
  
  public org.LexGrid.LexBIG.cagrid.LexEVSGridService.ResolvedConceptReferencesIterator.stubs.types.ResolvedConceptReferencesIteratorReference resolve(org.LexGrid.LexBIG.iso21090.DataModel.cagrid.SetResolutionPolicy setResolutionPolicy) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBParameterException {
		org.apache.axis.message.addressing.EndpointReferenceType epr = new org.apache.axis.message.addressing.EndpointReferenceType();
		org.LexGrid.LexBIG.cagrid.LexEVSGridService.ResolvedConceptReferencesIterator.service.globus.resource.ResolvedConceptReferencesIteratorResourceHome home = null;
		org.globus.wsrf.ResourceKey resourceKey = null;
		org.apache.axis.MessageContext ctx = org.apache.axis.MessageContext.getCurrentContext();
		String servicePath = ctx.getTargetService();
		String homeName = org.globus.wsrf.Constants.JNDI_SERVICES_BASE_NAME + servicePath + "/" + "resolvedConceptReferencesIteratorHome";

		try {
			javax.naming.Context initialContext = new javax.naming.InitialContext();
			home = (org.LexGrid.LexBIG.cagrid.LexEVSGridService.ResolvedConceptReferencesIterator.service.globus.resource.ResolvedConceptReferencesIteratorResourceHome) initialContext.lookup(homeName);
			resourceKey = home.createResource();
			
			//  Grab the newly created resource
			org.LexGrid.LexBIG.cagrid.LexEVSGridService.ResolvedConceptReferencesIterator.service.globus.resource.ResolvedConceptReferencesIteratorResource thisResource = (org.LexGrid.LexBIG.cagrid.LexEVSGridService.ResolvedConceptReferencesIterator.service.globus.resource.ResolvedConceptReferencesIteratorResource)home.find(resourceKey);
			
			//  This is where the creator of this resource type can set whatever needs
			//  to be set on the resource so that it can function appropriatly  for instance
			//  if you want the resouce to only have the query string then there is where you would
			//  give it the query string.
					
			Calendar cal = new GregorianCalendar();
            cal.add(Calendar.MINUTE,5);
            thisResource.setTerminationTime(cal);
			// sample of setting creator only security.  This will only allow the caller that created
			// this resource to be able to use it.
			//thisResource.setSecurityDescriptor(gov.nih.nci.cagrid.introduce.servicetools.security.SecurityUtils.createCreatorOnlyResourceSecurityDescriptor());
            SortOptionList sortOptions = ConvertUtils.convert(setResolutionPolicy.getSortOptions(), SortOptionList.class);
  		    LocalNameList propertyNames = ConvertUtils.convert(setResolutionPolicy.getPropertyNames(), LocalNameList.class);
  		    PropertyType[] propertyTypes = Utils.convertPropertyType(setResolutionPolicy.getPropertyTypes());
             
            ResolvedConceptReferencesIterator  rcri = getResourceHome().getAddressedResource().getCodedNodeSet().resolve(sortOptions, propertyNames, propertyTypes);
			thisResource.setResolvedConceptReferencesIterator(rcri);
			

			String transportURL = (String) ctx.getProperty(org.apache.axis.MessageContext.TRANS_URL);
			transportURL = transportURL.substring(0,transportURL.lastIndexOf('/') +1 );
			transportURL += "ResolvedConceptReferencesIterator";
			epr = org.globus.wsrf.utils.AddressingUtils.createEndpointReference(transportURL,resourceKey);
		 } catch (Exception e) {
				Utils.processException(e);
		 }

		//return the typed EPR
		org.LexGrid.LexBIG.cagrid.LexEVSGridService.ResolvedConceptReferencesIterator.stubs.types.ResolvedConceptReferencesIteratorReference ref = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.ResolvedConceptReferencesIterator.stubs.types.ResolvedConceptReferencesIteratorReference();
		ref.setEndpointReference(epr);

		return ref;
  }

  public void restrictToProperties(org.LexGrid.LexBIG.iso21090.DataModel.Collections.LocalNameList propertyList,org.LexGrid.LexBIG.iso21090.DataModel.enums.PropertyType[] propertyType,org.LexGrid.LexBIG.iso21090.DataModel.Collections.LocalNameList localNameList2,org.LexGrid.LexBIG.iso21090.DataModel.Collections.LocalNameList localNameList3,org.LexGrid.LexBIG.iso21090.DataModel.Collections.NameAndValueList nameAndValueList) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBParameterException {
	  	try {
	  		CodedNodeSet cns = getResourceHome().getAddressedResource().getCodedNodeSet();
	  		CodedNodeSet cnsRestricted = cns.restrictToProperties(
	  				ConvertUtils.convert(propertyList, LocalNameList.class), 
	  				Utils.convertPropertyType(propertyType));
	  		getResourceHome().getAddressedResource().setCodedNodeSet(cnsRestricted);
	  	 } catch (Exception e) {
				Utils.processException(e);
		 }   
  }

  public void restrictToStatus(org.LexGrid.LexBIG.iso21090.DataModel.enums.ActiveOption activeOption,org.LexGrid.LexBIG.iso21090.DataModel.cagrid.Status[] status) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBParameterException {
	  try {
		  CodedNodeSet cns = getResourceHome().getAddressedResource().getCodedNodeSet();
		  CodedNodeSet cnsRestricted = cns.restrictToStatus(Utils.convertActiveOption(activeOption), Utils.statusArrayToString(status) );
		getResourceHome().getAddressedResource().setCodedNodeSet(cnsRestricted);
	  } catch (Exception e) {
			Utils.processException(e);
	  }
  }

  public void intersect(org.LexGrid.LexBIG.cagrid.LexEVSGridService.CodedNodeSet.stubs.types.CodedNodeSetReference codes) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBParameterException {
	 try {	 
	 
		ResourceKey key = getResourceHome().getAddressedResource().getResourceKey();
			
		QName name = key.getName();
		MessageElement returnedValue = codes.getEndpointReference().getProperties().get(key.getName());
		String value = returnedValue.getValue();
		
		ResourceKey newKey = new SimpleResourceKey(name, value);
		CodedNodeSetResource cnsr = this.getResourceHome().getResource((newKey));
		CodedNodeSet cns = cnsr.getCodedNodeSet();
		
		CodedNodeSet resource = getResourceHome().getAddressedResource().getCodedNodeSet();
		resource = resource.intersect(cns);	
		
		this.getResourceHome().getAddressedResource().setCodedNodeSet(resource);
	 } catch (Exception e) {
			Utils.processException(e);
	 } 	
  }

  public void union(org.LexGrid.LexBIG.cagrid.LexEVSGridService.CodedNodeSet.stubs.types.CodedNodeSetReference codes) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBParameterException {
		 try {
				ResourceKey key = getResourceHome().getAddressedResource().getResourceKey();
				
				QName name = key.getName();
				MessageElement returnedValue = codes.getEndpointReference().getProperties().get(key.getName());
				String value = returnedValue.getValue();
				
				ResourceKey newKey = new SimpleResourceKey(name, value);
				CodedNodeSetResource cnsr = this.getResourceHome().getResource((newKey));
				CodedNodeSet cns = cnsr.getCodedNodeSet();
				
				CodedNodeSet resource = getResourceHome().getAddressedResource().getCodedNodeSet();
				resource = resource.union(cns);	
		
				this.getResourceHome().getAddressedResource().setCodedNodeSet(resource);
		 } catch (Exception e) {
				Utils.processException(e);
		 }
  }

  public void difference(org.LexGrid.LexBIG.cagrid.LexEVSGridService.CodedNodeSet.stubs.types.CodedNodeSetReference codes) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBParameterException {
		 try {
				ResourceKey key = getResourceHome().getAddressedResource().getResourceKey();
				
				QName name = key.getName();
				MessageElement returnedValue = codes.getEndpointReference().getProperties().get(key.getName());
				String value = returnedValue.getValue();
				
				ResourceKey newKey = new SimpleResourceKey(name, value);
				CodedNodeSetResource cnsr = this.getResourceHome().getResource((newKey));
				CodedNodeSet cns = cnsr.getCodedNodeSet();
				
				CodedNodeSet resource = getResourceHome().getAddressedResource().getCodedNodeSet();
				resource = resource.difference(cns);	
		
				this.getResourceHome().getAddressedResource().setCodedNodeSet(resource);
		 } catch (Exception e) {
				Utils.processException(e);
		 }
  }

  public void restrictToMatchingProperties(org.LexGrid.LexBIG.iso21090.DataModel.Collections.LocalNameList localNameList,org.LexGrid.LexBIG.iso21090.DataModel.enums.PropertyType[] propertyType,org.LexGrid.LexBIG.iso21090.DataModel.Collections.LocalNameList localNameList2,org.LexGrid.LexBIG.iso21090.DataModel.Collections.LocalNameList localNameList3,org.LexGrid.LexBIG.iso21090.DataModel.Collections.NameAndValueList nameAndValueList,org.LexGrid.LexBIG.iso21090.DataModel.cagrid.MatchCriteria matchCriteria,org.LexGrid.LexBIG.iso21090.DataModel.cagrid.ExtensionIdentification extensionIdentification,org.LexGrid.LexBIG.iso21090.DataModel.cagrid.LanguageIdentification languageIdentification) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBParameterException {
	  try {
		  CodedNodeSet cns = getResourceHome().getAddressedResource().getCodedNodeSet();
		  CodedNodeSet cnsRestricted = cns.restrictToMatchingProperties(
				  ConvertUtils.convert(localNameList, LocalNameList.class),
				  Utils.convertPropertyType(propertyType), 
				  ConvertUtils.convert(localNameList2, LocalNameList.class),
				  ConvertUtils.convert(localNameList3, LocalNameList.class), 
				  ConvertUtils.convert(nameAndValueList, org.LexGrid.LexBIG.DataModel.Collections.NameAndValueList.class), 
				  matchCriteria.getText().getValue(), 
				  extensionIdentification.getLexBIGExtensionName().getValue(), 
				  languageIdentification.getIdentifier().getValue());
		  getResourceHome().getAddressedResource().setCodedNodeSet(cnsRestricted);
	  } catch (Exception e) {
			Utils.processException(e);
	  }
  }
}

