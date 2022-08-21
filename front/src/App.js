import React, { Profiler } from 'react';
import './App.css';
import Navbar from './Component/Navbar/Navbar';
import Discovery from './Discovery';
import Ongoing from './Ongoing';
import Leaderboard from './Leaderboard';
import Profile from './Profile';
import {Route, Routes} from 'react-router-dom'

function App() {
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
        </Routes>
      </div>
    </div>
  );
}

export default App;
