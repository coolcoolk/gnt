import React, { Component, useEffect, useState } from 'react';
import axios from 'axios';
import MarketDiscoveryTopicContainer from './MarketComponent/MarketDiscoveryTopicContainer';
// testdata
import testtopicsdata from "../../testdb/topics.json"
import CountdownTimer from '../../Components/MarketComponents/CountdownTimer/CountdownTimer';
import Percentagebar from '../../Components/MarketComponents/Percentagebar/Percentagebar';
import { Route } from 'react-router-dom';

export default function Discovery() {

    return(

      <div className="container">
          <MarketDiscoveryTopicContainer/>
          {/* <MarketDiscoveryTopicContainer/>
          <MarketDiscoveryTopicContainer/>
          <MarketDiscoveryTopicContainer/> */}
      </div>
    )
  }