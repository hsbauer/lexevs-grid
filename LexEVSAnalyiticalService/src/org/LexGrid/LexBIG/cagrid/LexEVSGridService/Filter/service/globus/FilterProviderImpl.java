package org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.service.globus;

import org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.service.FilterImpl;

import java.rmi.RemoteException;

/** 
 * DO NOT EDIT:  This class is autogenerated!
 *
 * This class implements each method in the portType of the service.  Each method call represented
 * in the port type will be then mapped into the unwrapped implementation which the user provides
 * in the LexBIGCaGridServicesImpl class.  This class handles the boxing and unboxing of each method call
 * so that it can be correclty mapped in the unboxed interface that the developer has designed and 
 * has implemented.  Authorization callbacks are automatically made for each method based
 * on each methods authorization requirements.
 * 
 * @created by Introduce Toolkit version 1.2
 * 
 */
public class FilterProviderImpl{
	
	FilterImpl impl;
	
	public FilterProviderImpl() throws RemoteException {
		impl = new FilterImpl();
	}
	

    public org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.stubs.MatchResponse match(org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.stubs.MatchRequest params) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess {
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.stubs.MatchResponse boxedResult = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.stubs.MatchResponse();
    boxedResult.setResponse(impl.match(params.getRef().getResolvedConceptReference()));
    return boxedResult;
  }

    public org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.stubs.GetNameResponse getName(org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.stubs.GetNameRequest params) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess {
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.stubs.GetNameResponse boxedResult = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.stubs.GetNameResponse();
    boxedResult.setResponse(impl.getName());
    return boxedResult;
  }

    public org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.stubs.GetDescriptionResponse getDescription(org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.stubs.GetDescriptionRequest params) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess {
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.stubs.GetDescriptionResponse boxedResult = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.stubs.GetDescriptionResponse();
    boxedResult.setResponse(impl.getDescription());
    return boxedResult;
  }

    public org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.stubs.GetProviderResponse getProvider(org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.stubs.GetProviderRequest params) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess {
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.stubs.GetProviderResponse boxedResult = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.stubs.GetProviderResponse();
    boxedResult.setResponse(impl.getProvider());
    return boxedResult;
  }

    public org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.stubs.GetVersionResponse getVersion(org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.stubs.GetVersionRequest params) throws RemoteException, org.LexGrid.LexBIG.cagrid.LexEVSGridService.stubs.types.InvalidServiceContextAccess {
    org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.stubs.GetVersionResponse boxedResult = new org.LexGrid.LexBIG.cagrid.LexEVSGridService.Filter.stubs.GetVersionResponse();
    boxedResult.setResponse(impl.getVersion());
    return boxedResult;
  }

}
