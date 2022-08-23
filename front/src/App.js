import React, { Component, Profiler } from 'react';
import './App.css';
import Navbar from './Component/Navbar/Navbar';
import Discovery from './Pages/Market/Discovery';
import Ongoing from './Pages/Ongoing';
import axios from 'axios'
import Leaderboard from './Pages/Leaderboard';
import Profile from './Pages/Profile';
import MarketBeforeBet from './Pages/Market/MarketBeforeBet';
import {Route, Routes} from 'react-router-dom';

function App (){

    return (
      <div className="App">
        <Navbar/>
        <div className='container'>
          <Routes>
            <Route path='/' element={<Discovery/>}></Route>
            <Route path='/discovery' element={<Discovery/>}></Route>
            <Route path='/ongoing' element={<Ongoing/>}></Route>
            <Route path='/leaderboard' element={<Leaderboard/>}></Route>
            <Route path='/profile'element={<Profile/>}></Route>
            <Route path='/market' element={<MarketBeforeBet/>}></Route>
          </Routes>
        </div>
      </div>
    );
  }

export default App;
