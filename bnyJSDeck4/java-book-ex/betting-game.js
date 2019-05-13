//returns a random integer between (m,n) inclusive
function rand(m, n){
  return m+Math.floor((n-m+1)*Math.random());
}
//randomly returns a string representing a face of any die
function randFace() {
  return ["crown", "anchor", "heart", "spade", "club", "diamond"]
  [rand(0,5)];
}

let funds=50; //starting conditions
let round = 0;

while (funds>1 && funds<100) {
  round ++;
  console.log(`round: ${round}`);
  console.log(`\tstarting funds: ${funds}p`)
  //place bets
  const bets = {crown: 0, anchor: 0, heart: 0, spade: 0, club: 0, diamond: 0};
  let totalbet = rand(1,funds);
  if (totalbet===7){
    totalbet=funds;
    bet.heart=totalbet;
  }else {

    //distribute bets
    let remaining=totalbet;
    do {
      let bet=rand(1, remaining);
      let face=randFace();
      bets[face]=bets[face]+bet;
      remaining=remaining-bet;
    }while (remaining>0)
  }
  funds= funds-totalbet;
  console.log('\tbets: ' +
    Object.keys(bets).map(face => `${face}: ${bets[face]} pence`).join(', ') +
    ` (total: ${totalbet} pence)`);

  //roll dice
  const hand = [];
  for(roll=0; roll<3; roll++) {
    hand.push(randFace());
  }
  console.log(`\thand: ${hand.join(', ')}`);

  //collect winnings
  let winnings=0;
  for(let die=0; die<hand.length; die++ ) {
    let face = hand[die];
    if(bets[face]>0) {
      winnings = winnings +bets[face];
    }funds = funds+winnings;
  console.log(`\twinnings: ${winnings}`);
    }
}
console.log(`\tending funs: ${funds}`);
