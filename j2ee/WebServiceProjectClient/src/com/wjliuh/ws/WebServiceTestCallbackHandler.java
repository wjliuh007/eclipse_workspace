
/**
 * WebServiceTestCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */

    package com.wjliuh.ws;

    /**
     *  WebServiceTestCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class WebServiceTestCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public WebServiceTestCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public WebServiceTestCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for multiply method
            * override this method for handling normal response from multiply operation
            */
           public void receiveResultmultiply(
                    com.wjliuh.ws.WebServiceTestStub.MultiplyResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from multiply operation
           */
            public void receiveErrormultiply(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for minus method
            * override this method for handling normal response from minus operation
            */
           public void receiveResultminus(
                    com.wjliuh.ws.WebServiceTestStub.MinusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from minus operation
           */
            public void receiveErrorminus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for plus method
            * override this method for handling normal response from plus operation
            */
           public void receiveResultplus(
                    com.wjliuh.ws.WebServiceTestStub.PlusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from plus operation
           */
            public void receiveErrorplus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for divide method
            * override this method for handling normal response from divide operation
            */
           public void receiveResultdivide(
                    com.wjliuh.ws.WebServiceTestStub.DivideResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from divide operation
           */
            public void receiveErrordivide(java.lang.Exception e) {
            }
                


    }
    