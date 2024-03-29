package org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.client;

import java.io.InputStream;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.AxisClient;
import org.apache.axis.client.Stub;
import org.apache.axis.configuration.FileProvider;
import org.apache.axis.message.addressing.EndpointReferenceType;
import org.apache.axis.types.URI.MalformedURIException;

import org.oasis.wsrf.properties.GetResourcePropertyResponse;

import org.globus.gsi.GlobusCredential;

import org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.HistoryServicePortType;
import org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.service.HistoryServiceAddressingLocator;
import org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.common.HistoryServiceI;
import gov.nih.nci.cagrid.introduce.security.client.ServiceSecurityClient;

/**
 * This class is autogenerated, DO NOT EDIT GENERATED GRID SERVICE ACCESS METHODS.
 *
 * This client is generated automatically by Introduce to provide a clean unwrapped API to the
 * service.
 *
 * On construction the class instance will contact the remote service and retrieve it's security
 * metadata description which it will use to configure the Stub specifically for each method call.
 * 
 * @created by Introduce Toolkit version 1.3
 */
public class HistoryServiceClient extends HistoryServiceClientBase implements HistoryServiceI {	

	public HistoryServiceClient(String url) throws MalformedURIException, RemoteException {
		this(url,null);	
	}

	public HistoryServiceClient(String url, GlobusCredential proxy) throws MalformedURIException, RemoteException {
	   	super(url,proxy);
	}
	
	public HistoryServiceClient(EndpointReferenceType epr) throws MalformedURIException, RemoteException {
	   	this(epr,null);
	}
	
	public HistoryServiceClient(EndpointReferenceType epr, GlobusCredential proxy) throws MalformedURIException, RemoteException {
	   	super(epr,proxy);
	}

	public static void usage(){
		System.out.println(HistoryServiceClient.class.getName() + " -url <service url>");
	}
	
	public static void main(String [] args){
	    System.out.println("Running the Grid Service Client");
		try{
		if(!(args.length < 2)){
			if(args[0].equals("-url")){
			  HistoryServiceClient client = new HistoryServiceClient(args[1]);
			  // place client calls here if you want to use this main as a
			  // test....
			} else {
				usage();
				System.exit(1);
			}
		} else {
			usage();
			System.exit(1);
		}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

  public org.LexGrid.LexBIG.iso21090.DataModel.Collections.NCIChangeEventList getAncestors(org.LexGrid.LexBIG.iso21090.DataModel.Core.ConceptReference conceptReference) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBParameterException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getAncestors");
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetAncestorsRequest params = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetAncestorsRequest();
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetAncestorsRequestConceptReference conceptReferenceContainer = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetAncestorsRequestConceptReference();
    conceptReferenceContainer.setConceptReference(conceptReference);
    params.setConceptReference(conceptReferenceContainer);
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetAncestorsResponse boxedResult = portType.getAncestors(params);
    return boxedResult.getNCIChangeEventList();
    }
  }

  public org.LexGrid.LexBIG.iso21090.DataModel.Collections.SystemReleaseList getBaselines(java.util.Date releasedAfter,java.util.Date releasedBefore) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBParameterException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getBaselines");
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetBaselinesRequest params = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetBaselinesRequest();
    params.setReleasedAfter(releasedAfter);
    params.setReleasedBefore(releasedBefore);
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetBaselinesResponse boxedResult = portType.getBaselines(params);
    return boxedResult.getSystemReleaseList();
    }
  }

  public org.LexGrid.LexBIG.iso21090.DataModel.Collections.CodingSchemeVersionList getConceptChangeVersions(org.LexGrid.LexBIG.iso21090.DataModel.Core.ConceptReference conceptReference,java.util.Date beginDate,java.util.Date endDate) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBParameterException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getConceptChangeVersions");
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetConceptChangeVersionsRequest params = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetConceptChangeVersionsRequest();
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetConceptChangeVersionsRequestConceptReference conceptReferenceContainer = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetConceptChangeVersionsRequestConceptReference();
    conceptReferenceContainer.setConceptReference(conceptReference);
    params.setConceptReference(conceptReferenceContainer);
    params.setBeginDate(beginDate);
    params.setEndDate(endDate);
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetConceptChangeVersionsResponse boxedResult = portType.getConceptChangeVersions(params);
    return boxedResult.getCodingSchemeVersionList();
    }
  }

  public org.LexGrid.iso21090.versions.CodingSchemeVersion getConceptCreationVersion(org.LexGrid.LexBIG.iso21090.DataModel.Core.ConceptReference conceptReference) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBParameterException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getConceptCreationVersion");
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetConceptCreationVersionRequest params = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetConceptCreationVersionRequest();
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetConceptCreationVersionRequestConceptReference conceptReferenceContainer = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetConceptCreationVersionRequestConceptReference();
    conceptReferenceContainer.setConceptReference(conceptReference);
    params.setConceptReference(conceptReferenceContainer);
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetConceptCreationVersionResponse boxedResult = portType.getConceptCreationVersion(params);
    return boxedResult.getCodingSchemeVersion();
    }
  }

  public org.LexGrid.LexBIG.iso21090.DataModel.Collections.NCIChangeEventList getDescendents(org.LexGrid.LexBIG.iso21090.DataModel.Core.ConceptReference conceptReference) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBParameterException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getDescendents");
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetDescendentsRequest params = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetDescendentsRequest();
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetDescendentsRequestConceptReference conceptReferenceContainer = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetDescendentsRequestConceptReference();
    conceptReferenceContainer.setConceptReference(conceptReference);
    params.setConceptReference(conceptReferenceContainer);
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetDescendentsResponse boxedResult = portType.getDescendents(params);
    return boxedResult.getNCIChangeEventList();
    }
  }

  public org.LexGrid.iso21090.versions.SystemRelease getEarliestBaseline() throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getEarliestBaseline");
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetEarliestBaselineRequest params = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetEarliestBaselineRequest();
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetEarliestBaselineResponse boxedResult = portType.getEarliestBaseline(params);
    return boxedResult.getSystemRelease();
    }
  }

  public org.LexGrid.LexBIG.iso21090.DataModel.Collections.NCIChangeEventList getEditActionList(org.LexGrid.LexBIG.iso21090.DataModel.Core.ConceptReference conceptReference,org.apache.axis.types.URI releaseURN) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBParameterException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getEditActionList");
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetEditActionListRequest params = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetEditActionListRequest();
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetEditActionListRequestConceptReference conceptReferenceContainer = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetEditActionListRequestConceptReference();
    conceptReferenceContainer.setConceptReference(conceptReference);
    params.setConceptReference(conceptReferenceContainer);
    params.setReleaseURN(releaseURN);
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetEditActionListResponse boxedResult = portType.getEditActionList(params);
    return boxedResult.getNCIChangeEventList();
    }
  }

  public org.LexGrid.LexBIG.iso21090.DataModel.Collections.NCIChangeEventList getEditActionList2(org.LexGrid.LexBIG.iso21090.DataModel.Core.ConceptReference conceptReference,org.LexGrid.iso21090.versions.CodingSchemeVersion codingSchemeVersion) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBParameterException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getEditActionList2");
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetEditActionList2Request params = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetEditActionList2Request();
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetEditActionList2RequestConceptReference conceptReferenceContainer = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetEditActionList2RequestConceptReference();
    conceptReferenceContainer.setConceptReference(conceptReference);
    params.setConceptReference(conceptReferenceContainer);
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetEditActionList2RequestCodingSchemeVersion codingSchemeVersionContainer = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetEditActionList2RequestCodingSchemeVersion();
    codingSchemeVersionContainer.setCodingSchemeVersion(codingSchemeVersion);
    params.setCodingSchemeVersion(codingSchemeVersionContainer);
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetEditActionList2Response boxedResult = portType.getEditActionList2(params);
    return boxedResult.getNCIChangeEventList();
    }
  }

  public org.LexGrid.LexBIG.iso21090.DataModel.Collections.NCIChangeEventList getEditActionList3(org.LexGrid.LexBIG.iso21090.DataModel.Core.ConceptReference conceptReference,java.util.Date beginDate,java.util.Date endDate) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBParameterException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getEditActionList3");
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetEditActionList3Request params = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetEditActionList3Request();
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetEditActionList3RequestConceptReference conceptReferenceContainer = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetEditActionList3RequestConceptReference();
    conceptReferenceContainer.setConceptReference(conceptReference);
    params.setConceptReference(conceptReferenceContainer);
    params.setBeginDate(beginDate);
    params.setEndDate(endDate);
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetEditActionList3Response boxedResult = portType.getEditActionList3(params);
    return boxedResult.getNCIChangeEventList();
    }
  }

  public org.LexGrid.iso21090.versions.SystemRelease getLatestBaseline() throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getLatestBaseline");
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetLatestBaselineRequest params = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetLatestBaselineRequest();
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetLatestBaselineResponse boxedResult = portType.getLatestBaseline(params);
    return boxedResult.getSystemRelease();
    }
  }

  public org.LexGrid.LexBIG.iso21090.DataModel.InterfaceElements.SystemReleaseDetail getSystemRelease(org.apache.axis.types.URI releaseURN) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBParameterException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.LBInvocationException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getSystemRelease");
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetSystemReleaseRequest params = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetSystemReleaseRequest();
    params.setReleaseURN(releaseURN);
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.HistoryService.stubs.GetSystemReleaseResponse boxedResult = portType.getSystemRelease(params);
    return boxedResult.getSystemReleaseDetail();
    }
  }

  public org.oasis.wsrf.lifetime.DestroyResponse destroy(org.oasis.wsrf.lifetime.Destroy params) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"destroy");
    return portType.destroy(params);
    }
  }

  public org.oasis.wsrf.lifetime.SetTerminationTimeResponse setTerminationTime(org.oasis.wsrf.lifetime.SetTerminationTime params) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"setTerminationTime");
    return portType.setTerminationTime(params);
    }
  }

  public org.oasis.wsrf.properties.GetMultipleResourcePropertiesResponse getMultipleResourceProperties(org.oasis.wsrf.properties.GetMultipleResourceProperties_Element params) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getMultipleResourceProperties");
    return portType.getMultipleResourceProperties(params);
    }
  }

  public org.oasis.wsrf.properties.GetResourcePropertyResponse getResourceProperty(javax.xml.namespace.QName params) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getResourceProperty");
    return portType.getResourceProperty(params);
    }
  }

  public org.oasis.wsrf.properties.QueryResourcePropertiesResponse queryResourceProperties(org.oasis.wsrf.properties.QueryResourceProperties_Element params) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"queryResourceProperties");
    return portType.queryResourceProperties(params);
    }
  }

}
